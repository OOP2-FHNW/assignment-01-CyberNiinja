package portfolio;

import portfolio.investments.Investment;
import java.util.ArrayList;

public class Portfolio<T extends Investment> {
    //TODO Complete this implementation and make it generic

    private ArrayList<T> investments;

    public Portfolio(){
        investments = new ArrayList<>();
    }

    public boolean contains(T investment){
        return investments.contains(investment);
    }

    public void buy(T investment){
        if(!(investments.contains(investment))){
            investments.add(investment);
        }else{
            for(T inv: investments){
                if(inv.equals(investment)){
                    inv.setCount(inv.getCount()+ 1);
                }
            }
        }
    }

    public void sell(String title, int count){
        T investment = null;
        for (T inv :investments)if(inv.getTitle().equals(title)) investment = inv;
        if (investment != null) {
            if(investment.getCount()-count >= 1){
                investment.setCount(investment.getCount()-count);
            }else{
                investment.setCount(0);
                investments.remove(investment);
            }
        }
    }

    //!!!!!!!!!!!!NAMING!!!!!!!!!!!!!!!!
    //should be renamed to getInvestment
    public T getShare(String title){
        for (T inv : investments) {
            if(inv.getTitle().equals(title))return inv;
        }
        return null;
    }
}
