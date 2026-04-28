class Solution(object):
    def findMaxLength(self, nums):
        seen = {0:-1}

        prefix = 0
        result = 0

        for i, num in enumerate(nums):
            if num == 0:
                prefix -=1
            else :
                prefix +=1
            
            if prefix in seen :
                length = i- seen[prefix]
                result = max(length,result)
            else : 
                seen[prefix] = i
            
        
        return result
        