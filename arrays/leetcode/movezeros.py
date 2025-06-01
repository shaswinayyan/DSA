#238. Move Zeros

nums =[]
nums = [0,1,0,3,12]

j=-1
n = len(nums)
for i in range(n):
    if(nums[i]==0):
        j=i
        break
if j ==-1:
    print(nums)

for i in range(j+1,n):
    if nums[i]!=0:
        nums[i],nums[j] = nums[j],nums[i]
        j+=1

print(nums)