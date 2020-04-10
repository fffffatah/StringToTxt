class MyMain{
    public static void main(String[] args) {
        TxtWriter obj= new TxtWriter();
        obj.writeAt("testout.txt","kek",4);//FILE PATH, STRING TO WRITE, AT WHICH LINE
        obj.replaceAttxt("testout.txt","h","lol");//FILE PATH, STRING TO REPLACE, BY WHICH STRING TO REPLACE
    }
}