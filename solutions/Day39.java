class Day39 {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] intersec = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {

            boolean alreadyAdded = false;

      
            for (int x= 0; x < k; x++) {
                if (intersec[x] == nums1[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) continue;

           
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    intersec[k++] = nums1[i];
                    break;
                }
            }
        }

        return Arrays.copyOf(intersec, k);
    }
}