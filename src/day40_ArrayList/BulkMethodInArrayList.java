package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethodInArrayList {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET","Developer","PO","CEO","Dev op","QA","BA","Chef","Doctor","Police officer","PO"));
        System.out.println("Original " + allJobs);

        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO","QA","BA"));
        System.out.println(jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET","Developer","Dev op","PO"));
        System.out.println(jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(jobs3.containsAll(Arrays.asList("Doctor","Nurse")));

























    }
}
