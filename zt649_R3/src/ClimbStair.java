public class ClimbStair {
    private static int m_targetSteps = 5;
    private static int m_ways = 0;
    
    public static void main(String[] args) {
        m_ways = Climb(1, 0, "") + Climb(2, 0, "");
        System.out.println("Total ways: " + m_ways);
    }

    private static int Climb(int _stepNum, int _totalStep, String _msg){
        int _currentStep = _stepNum + _totalStep;
        _msg = _msg + Integer.toString(_stepNum) + " step ";
        if (_currentStep == m_targetSteps) {
            System.out.println(_msg);
            return 1;
        } else if (_currentStep > m_targetSteps){
            return 0;
        } else {
            return Climb(1, _currentStep, _msg) + Climb(2, _currentStep, _msg);
        }
    }
}
