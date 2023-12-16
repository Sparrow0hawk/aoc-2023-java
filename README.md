# Advent of Code 2023 Java

Using [Advent of Code 2023](https://adventofcode.com/2023) to explore Java and Maven.

## Setup

To use this repository you will need:
- Java 21
- Maven 3.9.6

Download your puzzle input from Advent of Code and add the files to the [`resources`](./src/main/resources) directory 
with the format `dayX.txt` where `X` is the number of the day.

1. Build code
    ```bash
   mvn package 
   ```
2. Run compiled code
    ```bash
   java -jar target/aoc-2023-1.0-SNAPSHOT.jar
   ```
