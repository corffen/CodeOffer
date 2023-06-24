package org.gordon.string;

public class StringSolution {
    /**
     * 剑指 Offer 05. 替换空格
     * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
     * @param s
     * @return
     */
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String replaceSpace2(String s){
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        if (count == 0) {
            return s;
        }
        char[] newArray = new char[s.length() + count * 2];
        int j = newArray.length-1;
        for (int i = s.length()-1;i>=0;i--) {
            char c = s.charAt(i);
            if (c==' '){
                newArray[j--] = '0';
                newArray[j--] = '2';
                newArray[j--] = '%';
            }else{
                newArray[j--] = c;
            }
        }
        return new String(newArray);
    }
}
