# Hashing in Cryptography

## Introduction

Hashing is a fundamental concept in cryptography that involves transforming data using a hash function to produce a fixed-size output known as a hash. This process is widely used for data integrity verification, digital signatures, and password storage.

### Key Points

- **Data + Hashing Function = Hash**: The hash function takes input data and produces a unique hash value.
- **One-way Function**: It is computationally infeasible to reverse the hashing process and retrieve the original data from its hash.
- **Deterministic**: For the same input data, the hash function will always produce the same hash value.
- **Data Verification**: Hashing allows for efficient verification of downloaded data by comparing hashes.
- **Digital Signing**: Hashing plays a crucial role in digital signatures, ensuring data authenticity and integrity.

## Hash Functions

Hash functions are designed to efficiently map data of arbitrary size to fixed-size hash values. Some commonly used hash functions include SHA-256, MD5, and SHA-1.

### Properties of Hash Functions

1. **Deterministic**: Same input always produces the same output hash.
2. **Fast Computation**: Efficiently computes the hash value for any input size.
3. **Avalanche Effect**: A small change in input results in a significantly different output hash.
4. **Pre-image Resistance**: It's difficult to find the input data that corresponds to a given hash.
5. **Collision Resistance**: It's hard to find two different inputs that produce the same hash.

## Applications of Hashing

Hashing has numerous applications in various domains due to its properties and capabilities.

### Data Integrity

- Verifying the integrity of downloaded files by comparing their hashes with precomputed values.
- Protecting data during transmission by hashing and verifying hashes at the receiving end.

### Password Storage

- Storing passwords securely by hashing them before storage, ensuring that even if the hash is compromised, the original password remains hidden.

### Digital Signatures

- Creating digital signatures by hashing data and encrypting the hash with a private key, providing authentication and non-repudiation.

## Hashing for Data Verification

Hashing is instrumental in ensuring the authenticity and integrity of data.

### Verification Process

1. Compute the hash of the original data using a hash function.
2. Transmit or store the data along with its hash.
3. Recompute the hash of the received data or retrieved file.
4. Compare the computed hash with the transmitted hash to verify data integrity.

## Digital Signatures

Digital signatures rely on hashing and asymmetric cryptography to provide security in communications and transactions.

### Workflow

1. Hash the data/message using a hash function.
2. Encrypt the hash with the sender's private key to create a digital signature.
3. Transmit the message along with the digital signature.
4. Verify the digital signature by decrypting it with the sender's public key and comparing the computed hash with the received hash.