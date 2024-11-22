const { ethers } = require('ethers');
const fs = require('fs');


async function createMultipleWalletsFromSingleMnemonic(mnemonic, numOfWallets) {
    const privateKeys = [];
    const addresses = [];

    // Use ethers.utils.HDNode.fromMnemonic (v5)
    const hdNode = ethers.utils.HDNode.fromMnemonic(mnemonic);  // HDNode to derive child wallets

    // Loop to create multiple wallets with different derivation paths
    for (let i = 0; i < numOfWallets; i++) {
        // Derive wallet using different paths
        const childNode = hdNode.derivePath(m/44'/60'/0'/0/${i});

        // Push the wallet details to the respective arrays
        privateKeys.push(childNode.privateKey);
        addresses.push(childNode.address);
    }

    // Write the private keys to a file
    fs.writeFileSync('privateKeys.txt', privateKeys.join('\n'), 'utf-8');
 // Write the addresses to a file
    fs.writeFileSync('addresses.txt', addresses.join('\n'), 'utf-8');

    // Write the mnemonic (same for all) to a file
    fs.writeFileSync('mnemonic.txt', mnemonic, 'utf-8');

    console.log("100 wallets generated from one mnemonic and saved to files:");
    console.log("  - privateKeys.txt");
    console.log("  - addresses.txt");
    console.log("  - mnemonic.txt (same mnemonic for all wallets)");
}

// Generate a new random mnemonic (12 words)
const mnemonic = ethers.Wallet.createRandom().mnemonic.phrase;


createMultipleWalletsFromSingleMnemonic(mnemonic, 100);