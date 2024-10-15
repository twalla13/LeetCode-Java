import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount
{
    public static List<String> subdomainVisits(String[] cpdomains) {

        //Doesnt work, close but gets an error
        HashMap<String, Integer> countMap = new HashMap<>();

        for(int i = 0; i < cpdomains.length; i++){

            //domainInfo = ["count", "domain"]
            String[] domainInfo = cpdomains[i].split("\\s+");
            String domain = domainInfo[1];
            Integer count = Integer.parseInt(domainInfo[0]);
            String[] subdomain = domain.split("\\.");
            String current= "";
           for(int j = subdomain.length -1 ; j>=0 ; --j ){
                    current = subdomain[j] + (j < subdomain.length - 1 ? "." : "") + current;
                    countMap.put(current, countMap.getOrDefault(current,0) + count);
                    System.out.println("current subdomain: " + current + " count in hashmap: " + countMap.get(current));
            }

        }

        //How to print a hashmap with its value and key

        List<String> ans = new ArrayList();
        for (String dom: countMap.keySet())
            ans.add("" + countMap.get(dom) + " " + dom);
        return ans;
    }
}
