package OpenRPG.Characters;

import OpenRPG.DefaultParameter;
import OpenRPG.IParameter;
import OpenRPG.IParameterSet;

import java.util.Comparator;

public interface Battler {
    Comparator<Battler> compareBattleOrder = new Comparator<Battler>() {
        @Override
        public int compare(Battler b1, Battler b2) {
            IParameter battler1Parameter = b1.getBattleOrderParameter();
            IParameter battler2Parameter = b2.getBattleOrderParameter();

            return DefaultParameter.compareParameter.compare(battler1Parameter, battler2Parameter);
        }
    };
    IParameter getBattleOrderParameter();
    IParameter getParameter(String parameterName);
    void setParameter(String parameterName, IParameter parameter);
    IParameterSet getParameters();
    void setParameters(IParameterSet parameters);
 }
