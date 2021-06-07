/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 23 - Troubleshooting Car Issues
An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a task that a human expert might do. Many websites are available that will help you self-diagnose a medical issue by answering a series of questions. And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues before calling a human.

Create a program that walks the user through troubleshooting issues with a car.

Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 */

import util.DecisionTree;

public class App {

    public static void main(String[] args) {
        String usrInput = DecisionTree.tree();
    }
}
