
    public class FriendsPairingProblem {
    public static int friendpairing(int n){
        if(n==1||n==2){
            return n;
        }
        int singleway = friendpairing(n-1);
        int pairway = (n-1)*friendpairing(n-2);
        int totalWays = singleway+pairway;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendpairing(4));
    }
  }

