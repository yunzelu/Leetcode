public class Main {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int k = re.removeElement(new int[] {0,1,2,2,3,0,4,2}, 2);
        System.out.println(k);
    }
}