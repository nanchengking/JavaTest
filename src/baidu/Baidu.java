package baidu;

public class Baidu {

    public static void main(String[] args) {
        System.out.println(getSum("81 4 \n 2 2"));
        System.out.println(getFlower("100 120 \n 300 380"));
    }

    public static String getSum(String numList) {
        String[] groups = numList.split("\n");
        StringBuffer results = new StringBuffer();
        java.text.DecimalFormat df = new java.text.DecimalFormat("#.##");
        if (groups.length == 0)
            return null;
        for (int i = 0; i < groups.length; i++) {
            String[] nums = groups[i].trim().split(" ");
            int n = Integer.parseInt(nums[0].trim());
            int m = Integer.parseInt(nums[1].trim());
            double sum = 0;
            double tem = n;
            for (int j = 0; j < m; j++) {
                sum += tem;
                tem = Math.sqrt(tem);
            }
            results.append(df.format(sum) + "\n");
        }
        return results.toString();
    }

    public static String getFlower(String numList) {
        String[] groups = numList.split("\n");
        StringBuffer results = new StringBuffer();
        if (groups.length == 0)
            return null;
        for (int i = 0; i < groups.length; i++) {
            boolean isGood=false;
            String[] nums = groups[i].trim().split(" ");
            int n = Integer.parseInt(nums[0].trim());
            int m = Integer.parseInt(nums[1].trim());
            int t = 0;
            if (n < m) {
                t = m;
                m = n;
                n = t;
            }
            for (int j = m; j<= n; j++) {
                char[] chars = (j + "").toCharArray();
                int sum = 0;
                for (int k = 0; k < chars.length; k++) {
                    char[] mChars = { chars[k] };
                    int a = Integer.parseInt(new String(mChars).trim());
                    sum += (a * a * a);
                }
                if (sum == j){
                    isGood=true;
                    results.append(j+" ");
                }
            }
            if(!isGood) results.append("no");
            results.append("\n");
        }
        return results.toString();
    }
}
