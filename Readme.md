# Patika.Dev Java Projects
<div align="center">
<img alt="BatuhanB" width="200" height="200" src="https://user-images.githubusercontent.com/56514839/200259435-347a3bdd-e062-4338-b2e3-21f86c547106.png"/>

<h3>What have been used for this project ?</h3>
<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
<p> The Project Has Been Made for <br><b style="color:orange;">www.patika.dev</b></p>
</div>

## Calculate Average of Grades
- This project aims to calculate and return information about grades of entering by users.
- This is a Java Console Application
### Getting Grades Using Scanner
```java 
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter your grades: ");
```
### Calculates Sum and Prints Message
```java
  float sum = 0; 
  sum = (math + psychs + history + music + turkish + chemistry);
  float average = CalculateAverage(sum);
  PrintMessage(average);
```
### Method for Calculating The Average of Grades
```java
private static float CalculateAverage(float sum) {
  float average = 0;
  average = sum / 6;
  return average;
  }
```
### Method for Print the Message of Result
```java
private static void PrintMessage(float average) {
        if (average > 60) {
            System.out.println("You have passed the class!");
        } else {
            System.out.println("Sorry! You have not passed the class!");
        }
    }

```
<div align="center">
<h3>Project Images</h3>
<img alt="image1" width="275" height="200" src="https://user-images.githubusercontent.com/56514839/207325474-564006a5-26c2-460a-a9da-c53edff113d4.png"/>
<img alt="image2" width="300" height="200" src="https://user-images.githubusercontent.com/56514839/207325684-b7781b1e-3fd6-40a6-9bed-5bc8a15a40ad.png"/>
</div>
