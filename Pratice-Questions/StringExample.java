class StringExample{
    public static void main(String [] args){
        // now doing the part of the string builder which is a mutable means change the values 
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World");
        String result = sb.toString();
        System.out.println(result);
    }
}