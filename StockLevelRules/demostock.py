
class StockLevelRules:
    def __init__(self, min_threshold, reorder_point, max_threshold):
        self.min_threshold = min_threshold
        self.reorder_point = reorder_point
        self.max_threshold = max_threshold

    def check_low_stock(self, stock_level):
        if stock_level < self.min_threshold:
            return True
        return False

    def check_reorder_point(self, stock_level):
        if stock_level < self.reorder_point:
            return True
        return False

    def check_max_stock_level(self, stock_level):
        if stock_level > self.max_threshold:
            return True
        return False

stock_level_rules = StockLevelRules(min_threshold=10, reorder_point=20, max_threshold=100)

stock_level = 15
if stock_level_rules.check_low_stock(stock_level):
    print("Low stock alert!")
if stock_level_rules.check_reorder_point(stock_level):
    print("Reorder request triggered!")
if stock_level_rules.check_max_stock_level(stock_level):
    print("Maximum stock level exceeded!")