import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class DestinationHashGenerator {

    /**
     * Generates an MD5 hash for a given string.
     *
     * @param input the input string to hash
     * @return the MD5 hash of the input
     */
    private static String generateMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 algorithm not found.", e);
        }
    }

    /**
     * Generates a random alphanumeric string of a given length.
     *
     * @param length the length of the random string
     * @return the generated random string
     */
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    /**
     * Recursively searches for the first occurrence of the "destination" key in a JSON tree.
     *
     * @param node the root JSON node
     * @return the value of the first "destination" key found, or null if not found
     */
    private static String findDestination(JsonNode node) {
        if (node.isObject()) {
            for (var entry : node.fields()) {
                if (entry.getKey().equals("destination")) {
                    return entry.getValue().asText();
                }
                String result = findDestination(entry.getValue());
                if (result != null) {
                    return result;
                }
            }
        } else if (node.isArray()) {
            for (JsonNode element : node) {
                String result = findDestination(element);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Validate command-line arguments
        if (args.length != 2) {
            System.err.println("Usage: java -jar DestinationHashGenerator.jar <roll_number> <path_to_json_file>");
            System.exit(1);
        }

        String rollNumber = args[0].toLowerCase(); // Ensure roll number is in lowercase
        String jsonFilePath = args[1];

        try {
            // Parse the JSON file
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));

            // Find the first "destination" value
            String destinationValue = findDestination(rootNode);
            if (destinationValue == null) {
                System.err.println("Error: 'destination' key not found in the provided JSON file.");
                System.exit(1);
            }

            // Generate a random 8-character alphanumeric string
            String randomString = generateRandomString(8);

            // Concatenate roll number, destination value, and random string
            String concatenated = rollNumber + destinationValue + randomString;

            // Generate the MD5 hash
            String hash = generateMD5Hash(concatenated);

            // Print the output
            System.out.println(hash + ";" + randomString);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            System.exit(1);
        }
    }
}
