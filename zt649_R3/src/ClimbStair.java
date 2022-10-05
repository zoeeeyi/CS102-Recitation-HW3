public class ClimbStair {
    static int m_ways = 0;
    static int m_target = 44;
    static int[] answers = new int[100];
    public static void main(String[] args) {
        long _startTime = System.currentTimeMillis();
        Climb(m_target);
        System.out.println(m_ways);
        long _endTime = System.currentTimeMillis();
        long _totalTime = _endTime - _startTime;
        System.out.println("Time usage: " + _totalTime);

        //Method 2
        _startTime = System.currentTimeMillis();
        System.out.println(Climb_2(m_target));
        _endTime = System.currentTimeMillis();
        _totalTime = _endTime - _startTime;
        System.out.println("Time usage: " + _totalTime);

        //Method 3
        _startTime = System.currentTimeMillis();
        System.out.println(Climb_3(m_target));
        _endTime = System.currentTimeMillis();
        _totalTime = _endTime - _startTime;
        System.out.println("Time usage: " + _totalTime);
    }
    
    static void Climb(int n) {
        for (int i = 1; i < 3; i++){
            int m = n - i;
            if (m == 0){
                m_ways ++;
            } else if (m > 0){
                Climb(m);
            }
        }
    }

    static int Climb_2(int n){
        if (n == 1){
            return 1;
        }
        
        if (n == 2){
            return 2;
        }
        
        if (n > 2){
            return Climb_2(n - 1) + Climb_2(n - 2);
        }
        
        return 0;
    }

    static int Climb_3(int n){
        if (n == 1){
            return 1;
        }
        
        if (n == 2){
            return 2;
        }
        
        if (answers[n] != 0) {
            return answers[n];
        }
        
        answers[n] = Climb_3(n - 1) + Climb_3(n - 2);
        return answers[n];
    }
}
