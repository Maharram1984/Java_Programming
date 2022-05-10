package day35_ReturnMethod;

import my_utilities.StringUtil;

public class UsingStringUtility {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("apple"));

        System.out.println(StringUtil.fixFormat("JAMES"));

        System.out.println(StringUtil.frequencyOfCharacter("apple", 'p'));

        System.out.println(StringUtil.frequencyOfCharacter("maharram", 'a'));

        System.out.println(StringUtil.uniqueCharacter("java"));
        System.out.println(StringUtil.uniqueCharacter("apple"));
    }

    }

