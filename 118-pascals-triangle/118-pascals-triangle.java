class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        List<Integer> row, prev_row = null;
        
        for(int i=0;i<numRows;i++){
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(prev_row.get(j-1)+prev_row.get(j));              
            }       
                prev_row = row;
                result.add(row); 
        }
        return result;
        
    }
}