
class CheckedDemo{
    public static void main(String args[]){
        System.out.println("Hello Java");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){

        } finally {
            System.out.print("");
        }
        System.out.println("An object oriented language");
    }
}