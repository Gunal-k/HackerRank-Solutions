def stones(n, a, b):
   res = []
   if a > b:
     a , b = b , a
   gap = b - a
 
   fav = a * (n-1)
   res.append(fav)
 
   if gap == 0:
     return res
 
   for i in range(1 , n):
     res.append(fav + (gap*i))
   return res