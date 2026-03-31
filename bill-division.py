def bonAppetit(bill, k, b):
    share = int((sum(bill) - bill[k])/2)
    if share == b:
        print("Bon Appetit")
    else:
        print(abs(share - b))