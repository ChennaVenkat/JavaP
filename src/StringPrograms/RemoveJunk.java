package StringPrograms;

// Program to remove junk (unwanted characters) from strings
public class RemoveJunk {

    public static void main(String[] args) {

        // Original strings with special characters (junk)
        String s = "@#!hello hyderabad *&^%$";
        String s2 = "@# hello %!@#%% world @(&^";
        String s3 = "@# Dell %!@#%% Laptop @(&^";

        // ---------------------------------------------------------
        // Case 1: Remove ALL junk characters (including spaces)
        // [^a-zA-Z0-9] means:
        // ^ → NOT
        // a-z → lowercase letters
        // A-Z → uppercase letters
        // 0-9 → numbers
        // So it removes everything EXCEPT letters & numbers
        // ---------------------------------------------------------
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        // Output → "hellohyderabad"


        // ---------------------------------------------------------
        // Case 2: Remove junk but KEEP spaces
        // Added space inside regex: [^a-zA-Z0-9 ]
        // This tells Java:
        // "Keep letters, numbers, AND spaces"
        // ---------------------------------------------------------
        s2 = s2.replaceAll("[^a-zA-Z0-9 ]", "");

        // Output → " hello  world "
        // ⚠️ Problem: extra spaces remain


        // ---------------------------------------------------------
        // Case 3: Remove junk + fix spacing properly
        // Step 1 → remove junk (same as above)
        // Step 2 → replace multiple spaces with single space
        // Step 3 → remove leading and trailing spaces
        // ---------------------------------------------------------
        s3 = s3.replaceAll("[^a-zA-Z0-9 ]", "")  // remove junk
               .replaceAll("\\s+", " ")          // replace multiple spaces with ONE space
               .trim();                          // remove spaces at beginning & end

        // Output → "Dell Laptop"


        // Print results
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}