package arrayLevelA;

public class Duplicates {


        public static void main(String[] args) throws Exception
        {
            String str = "MAN";

            char arr[] = str.toCharArray();

            char temp;

            int i = 0;
            while (i < arr.length) {
                int j = i + 1;
                while (j < arr.length) {
                    if (arr[j] < arr[i]) {

                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                    j += 1;
                }
                i += 1;
            }

            System.out.println(arr);
        }
    }


 /*   public static void main(String[] args) {
        System.out.println("remove duplicateElement");
    }

    public static Set<Character> findDuplicateForStringName(String Name) {

        Set<Character> duplicates = new LinkedHashSet<>();

        int name[] = {3, 3, 4, 5};

        for (int i = 0; i < name.length; i++) {
            // if (charAt.length(i) == charAt.length(j)
            // duplicates.add = name.charAt(j));
            // x
            System.out.println("duplicateElement");

        }
        return duplicates;
    }
}*/

      /*  for (int i = 0; i < name.(),i++){

            for (int j = i + 1; j < name.length(),i++){
                if (name.charAt(i) == name.charAt(j)
                duplicates.add = name.charAt(j));

            }
        }
        return duplicates;*/
      //  return duplicates;



