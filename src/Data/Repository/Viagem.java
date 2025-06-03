package Data.Repository;

import Data.Beans.Passagem;
import java.util.ArrayList;
import java.util.List;

public class Viagem {

    private List<Passagem> passagens = new ArrayList<>();

    public void adicionarPassagem(Passagem passagem) {
        passagens.add(passagem);
        }
        public List<Passagem> listarPassagens() {
            return new ArrayList<>(passagens);
        }

        public Passagem buscarPorNumero(String numero) {
            for (Passagem p : passagens) {
                if (p.getNumeroPassagem().equals(numero)) {
                    return p;
                }
            }
            return null;
        }

        public boolean removerPassagem(String numero) {
            Passagem p = buscarPorNumero(numero);
            if (p != null) {
                passagens.remove(p);
                return true;
            }
            return false;
        }
    }
