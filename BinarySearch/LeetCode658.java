class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> li=new ArrayList<>();
        for(int i:arr) li.add(i);
        Collections.sort(li,(n1,n2)-> Math.abs(n1-x)-Math.abs(n2-x));
        li=li.subList(0,k);
        Collections.sort(li);
        return li;
    }
}
