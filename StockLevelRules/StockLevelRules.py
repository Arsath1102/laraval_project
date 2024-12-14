class StockManager:
    def __init__(self,min_stock,reorder_point,max_stock):
        self.min_stock=min_stock
        self.reorder_point=reorder_point
        self.max_stock=max_stock

    def checkLowStock(self,stockLevel):
        if stockLevel<self.min_stock:
            return True
        return False
    def checkReorderPoint(self,stockLevel):
        if stockLevel<self.reorder_point:
            return True
        return False
    def checkMaxStock(self,stockLevel):
        if stockLevel>self.max_stock:
            return True
        return False
stockLevelManager=StockManager(min_stock=10,reorder_point=20,max_stock=100)
stockLevel=15
if stockLevelManager.checkLowStock(stockLevel):
    print("low stock alert")
if stockLevelManager.checkReorderPoint(stockLevel):
    print("reoder stock request!")
if stockLevelManager.checkMaxStock(stockLevel):
    print("the stock excueed")               
    