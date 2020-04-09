#  Encryption-Decryption
This project is based on the cryptography technique.

This technique is used between message send between sender and reciever.

Encryption is the process to convert your  data into cypher text to prevent from unauthorized access.

Decryption is the process to convert cypher text into the actual data.

It is  done through the shifting technique of cryptography.



1.If there is no -mode, the program should work in enc mode.

2.If there is no -key, the program should consider that key = 0.

3.If there is no -data, the program should assume that the data is an empty string.

  Keep in mind that arguments may be in different order. For example, -mode enc may be at the end, at the beginning or in the middle of arguments array.

#Run configuration examples for encryption

java Main -mode enc -key 5 -data "Welcome to hyperskill!"

Encryption output example:-

\jqhtrj%yt%m~ujwxpnqq&

#Run configuration examples for decryption

java Main -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec

Decryption output example

Welcome to hyperskill!


