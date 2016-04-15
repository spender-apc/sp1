package novozhilova.nastest;

import java.util.List;


public interface IDatabaseHandler {

        public void addCost(Cost cost);
        public Cost getCost(int id);
        public List<Cost> getAllCosts();
        public int getCostCount();
        public int updateCost(Cost cost);
        public void deleteCost(Cost cost);
        public void deleteAll();


}
