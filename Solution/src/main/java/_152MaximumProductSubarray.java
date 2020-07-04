class _152MaximumProductSubarray {
	public int maxProduct(int[] nums) {
		int maxProduct = nums[0];
		int minProduct = nums[0];
		int maxProductGlobal = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= 0) {
				maxProduct = Math.max(nums[i] * maxProduct, nums[i]);
				minProduct = Math.min(nums[i] * minProduct, nums[i]);
				;
			} else {
				int temp = maxProduct;
				maxProduct = Math.max(nums[i] * minProduct, nums[i]);
				minProduct = Math.min(nums[i] * temp, nums[i]);
			}
			maxProductGlobal = Math.max(maxProductGlobal, maxProduct);
		}
		return maxProductGlobal;
	}
}