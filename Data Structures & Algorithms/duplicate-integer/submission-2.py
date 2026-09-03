class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        mi_set=set()
        for num in nums:
            if num in mi_set:
                return True
            else:
                mi_set.add(num)
        return False
        