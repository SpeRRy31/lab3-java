public class stringManager {
    private String stringData;
    private String numberString;
    public stringManager(String data){
        this.stringData=data;
        this.numberString = stringToNumber(data);
    }

    public void setStringData(String stringData) {
        this.stringData = stringData;
    }
    public String getStringData() {
        return stringData;
    }

    public void setNumberString(String numberString) {
        this.numberString = numberString;
    }

    public String getNumberString() {
        return numberString;
    }

    private String stringToNumber(String data){
        StringBuilder res = new StringBuilder();
        for (char c : data.toCharArray()){ // toCharArray перетворює string в char []
            if (Character.isLetter(c)){
                int number = Character.toLowerCase(c) - 'a' + 1;// lowercase перетворює char в char з нижнім регістром А -> a

                if (number >= 10){
                    res.append(number).append(" ");
                } else {
                    res.append(number).append("  ");
                }

            } else {
                res.append("-").append("  ");
            }
        }
        return res.toString().trim();// trim видаляє пробіл вкінці
    }

    private String stringAddSpace(String data){
        StringBuilder res = new StringBuilder();
        for(char c : data.toCharArray()){
            res.append(c).append("  ");
        }
        return res.toString().trim();
    }
    public void printString(){
        System.out.println(this.stringAddSpace(this.stringData));
        System.out.println(this.getNumberString());
    }
}
