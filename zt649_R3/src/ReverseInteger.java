public class ReverseInteger {
    private static int m_num = 123456;

    public static void main(String[] args) {
        ReversePrint(m_num);
    }

    private static void ReversePrint(int _n){
        int _printNum = _n % 10;
        System.out.print(_printNum);

        //Change number
        _n = _n / 10;
        if (_n > 0){
            ReversePrint(_n);
        }
    }
}
