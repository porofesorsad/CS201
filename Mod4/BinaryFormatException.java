//Yasmin Torres
public class BinaryFormatException
{
/*
(Checked Exception) In preparation for a class Fraction, create a class
NullDenominatorException that must be a checked exception whose
instances are thrown if the denominator of an object of class Fraction is 0. 	
 */
public static int bin2Dec(String bin) throws NumberFormatException {

    if (!isBinary(bin)) {
        throw new NumberFormatException(bin + " is not a binary number.");
    }
    int pow = 0;
    int decimal = 0;
    for (int i = bin.length()-1; i >= 0; i--) {

        if(bin.charAt(i) == '1') 
            decimal += Math.pow(2, pow);
        pow++;
    }
    return decimal;
}

public static boolean isBinary(String binary) {

    for (char ch : binary.toCharArray()) {
        if (ch != '1' && ch != '0') return false;
    }
    return true;
}

/*
(BinaryFormatException) Exercise 12.7 implements the bin2Dec method
to throw a BinaryFormatException if the string is not a binary string. Define
a custom exception called BinaryFormatException. Implement the bin2Dec
method to throw a BinaryFormatException if the string is not a binary string 
 */
	public static void main(String[] args) 
	{
		System.out.println(bin2Dec("0101100"));
        System.out.println(bin2Dec("sksksk"));

	}

}
