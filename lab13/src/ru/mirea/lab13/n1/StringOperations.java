package ru.mirea.lab13.n1;

public class StringOperations {
    private String str;

    public void setString(String s) {
        this.str = s;
    }
    public void showLastChar() {
        System.out.println(this.str.charAt(this.str.length() - 1));
    }
    public boolean isEndsWith(String targetSTR) {
        return this.str.endsWith(targetSTR);
    }
    public boolean isContainJAVA() {
        return this.str.contains("Java");
    }
    public int findJAVApos() {
        return this.str.indexOf("Java");
    }
    public void replaceAtoO() {
        String newOne = this.str.replace('a', 'o');
        System.out.println(newOne);
    }
    public void toLow() {
        String newOne = this.str.toLowerCase();
        System.out.println(newOne);
    }
    public void toUp() {
        String newOne = this.str.toUpperCase();
        System.out.println(newOne);
    }
    public String cutJAVA() {
        return this.str.substring(this.str.indexOf("J"), this.str.lastIndexOf("a") + 1);
    }

    public static void main(String[] args) {
        StringOperations str = new StringOperations();
        str.setString("I like Java!!!");
        str.showLastChar();
        System.out.println(str.isEndsWith("!!!"));
        System.out.println(str.isContainJAVA());
        System.out.println(str.findJAVApos());
        str.replaceAtoO();
        str.toLow();
        str.toUp();
        System.out.println(str.cutJAVA());
    }
}
