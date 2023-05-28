package by.teachmeskills.lesson10.homework1;

public class Homework1 {
    public static void main(String[] args) {

        String strings = "5550-tiu-5678-abc-1a2b";

        StringHandler.extractTwoNumberBlocks(strings);

        StringHandler.replacingWithSymbol(strings);

        StringHandler.onlyLetters(strings);

        StringHandler.showLetters(strings);

        StringHandler.findAbc(strings);

        StringHandler.ifStartWith555(strings);

        StringHandler.ifEndWith1a2b(strings);
    }
}
