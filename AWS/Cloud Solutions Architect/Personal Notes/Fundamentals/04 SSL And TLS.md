# Overview
**1. Problem:**

- Before SSL/TLS, transmitting data over the internet was not secure.
- Data sent over HTTP (Hypertext Transfer Protocol) was vulnerable to interception by malicious actors.

**2. Solution:**

- SSL was developed by Netscape in the 1990s to provide a secure way to transmit data over the internet.
- TLS is the successor to SSL and provides similar security features.
- Both SSL and TLS use cryptographic protocols to secure data transmission.

**3. Efficiency:**

- SSL/TLS encrypts data during transmission, making it unreadable to anyone without the proper decryption key.
- This encryption ensures that even if data is intercepted, it cannot be easily deciphered by unauthorized parties.
- SSL/TLS also includes mechanisms for authentication, ensuring that the data is being exchanged with the intended recipient and not a malicious entity.

# SSL 
**How SSL Works:**

1. **Handshake Protocol:** Initiates a secure connection between client and server, including negotiating encryption algorithms and exchanging keys.
2. **Encryption and Decryption:** Uses symmetric encryption (e.g., AES) for data transmission and asymmetric encryption (e.g., RSA) during the handshake for key exchange.
3. **SSL Certificate:** Authenticates servers using digital certificates, verifying identity and ensuring trust through Certificate Authorities (CAs).

**Implementation Choices:**

- Layered architecture for modularity and flexibility.
- Balance between symmetric and asymmetric encryption for security and performance.
- Support for various cryptographic algorithms and key lengths to adapt to evolving security needs.
- Consideration of factors like backward compatibility, interoperability, and extensibility for widespread adoption.

## In-depth
### Handshake Protocol

1. **Client Initiates Connection**: The user opens their web browser and types in the URL for their bank's website, initiating a connection request.
2. **Server Response**: The bank's server receives the connection request and responds by sending its SSL certificate to the client.
3. **Certificate Verification**: The client's browser verifies the authenticity and validity of the SSL certificate. It checks if the certificate is issued by a trusted Certificate Authority (CA) and hasn't expired or been revoked.
4. **Encryption Algorithm Negotiation**: After verifying the certificate, the client and server negotiate on which encryption algorithm and key exchange method to use for secure communication. This negotiation ensures both parties agree on a mutually acceptable level of security.
5. **Key Exchange**: Using asymmetric encryption (e.g., RSA), the client and server exchange cryptographic keys securely. The server sends its public key, and the client generates a shared session key, which is encrypted with the server's public key and sent back to the server.
6. **Secure Connection Established**: With the session key exchanged securely, a secure connection is established between the client and server. Now, all data exchanged between them is encrypted using symmetric encryption (e.g., AES) with the shared session key.

### Encryption and Decryption

1. **Data Transmission**: The user logs in to their online banking account and performs transactions such as transferring funds or checking balances.
2. **Symmetric Encryption**: All data transmitted between the client and server, including login credentials and transaction details, is encrypted using symmetric encryption (e.g., AES). This encryption ensures that even if intercepted, the data remains unreadable without the session key.
3. **Data Integrity**: SSL also includes mechanisms to ensure data integrity. This means that any tampering or modification of data during transmission will be detected, preventing unauthorized alterations.
	- Hash functions generate unique hash values for data, while MACs use secret keys to create authentication tags for each message. When data is transmitted, SSL includes these hash values or authentication tags with the encrypted data. Upon receiving the data, the recipient recalculates the hash value or authentication tag and compares it with the received value.

### SSL Certificate
1. **Server Authentication**: When a user visits an e-commerce website to make a purchase, the website's server presents its SSL certificate to the client's browser.
2. **Certificate Validation**: The client's browser validates the SSL certificate by checking its digital signature, issuer details, and expiration date. It also verifies if the certificate is trusted by a known Certificate Authority (CA).
3. **Trust Establishment**: If the SSL certificate is valid and trusted, the client's browser establishes trust with the server, ensuring that the website is authentic and not a malicious imposter.
4. **Secure Transactions**: With the SSL certificate validation complete, the user can safely enter sensitive information such as credit card details for a secure transaction. The data is encrypted and transmitted securely, protecting it from unauthorized access.

**Shortcomings of SSL:**

1. **Vulnerabilities:** SSL had vulnerabilities such as POODLE, BEAST, and Heartbleed, which exposed weaknesses in protocol design and encryption algorithms.
2. **Performance:** SSL/TLS handshakes were relatively slow due to multiple round trips for key negotiation, impacting performance.
3. **Lack of Forward Secrecy:** Some SSL versions did not support forward secrecy, making past communications vulnerable if private keys were compromised.

**TLS Improvements over SSL:**

1. **Vulnerability Mitigation:**
    - TLS addressed vulnerabilities by introducing stronger encryption algorithms and protocols, such as AES for symmetric encryption and SHA-2 for hashing.

2. **Performance Enhancement:**
    - TLS reduced handshake latency through optimizations like TLS False Start and TLS 1.3 0-RTT (Zero Round Trip Time), allowing faster establishment of secure connections.
    - TLS session resumption techniques, like session tickets and session IDs, improved performance by reducing the need for repeated handshakes.

3. **Forward Secrecy Support:**    
    - TLS versions, especially TLS 1.2 and TLS 1.3, emphasize forward secrecy, ensuring that compromising a private key does not compromise past communications.
	    - This is achieved by deriving unique session keys for each session, making it difficult for an attacker to decrypt past communications even if they obtain the private key later.

**Comparison and Contrast:**
1. **Cipher Suites:**
    - SSL and early TLS versions supported a wider range of cipher suites, including weaker algorithms prone to vulnerabilities. In contrast, TLS versions focused on promoting stronger cipher suites and deprecating insecure ones.
    
2. **Handshake Performance:**
    - TLS reduced handshake overhead with optimizations like TLS False Start and TLS 1.3 0-RTT, enhancing performance compared to SSL.
    
3. **Security Features:**
    - TLS introduced enhanced security features like Extended Validation (EV) certificates, strict certificate validation, and stronger authentication mechanisms, bolstering security posture compared to SSL.
    
4. **Adoption and Support:**
    - TLS gained wider adoption and support across browsers, servers, and applications, gradually replacing SSL as the preferred protocol for secure communication.