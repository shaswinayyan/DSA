#136.Single Number

nums = [4,1,2,1,2]

hash={}

for num in nums:
    hash[num] = hash.get(num,0)+1

for num,count in hash.items():
    if count==1:
        print(num)


