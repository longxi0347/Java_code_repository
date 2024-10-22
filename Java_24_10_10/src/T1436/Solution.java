package T1436;

import java.util.List;

public class Solution {
    public String destCity(List<List<String>> paths) {
        int lsize = paths.size();
        int count = 0;
        String res = "";
        for (int i = 0; i < lsize; i++) {
            count = 0;
            for (int j = 0; j < lsize; j++) {
                if (paths.get(i).get(1).equals(paths.get(j).get(0))) {
                    break;
                }
                count++;
            }
            if (count == lsize) {
                res = paths.get(i).get(1);
                break;
            }
        }
        return res;
    }
}
