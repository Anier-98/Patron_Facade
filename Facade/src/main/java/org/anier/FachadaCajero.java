package org.anier;

/**
 * Simplifica el acceso a cada uno de los subsistemas
 * de un sistema bancario a través del cajero.
 */

public class FachadaCajero {


        public String sacarDinero()
        {
            return val.valida() + ret.retirar();
        }

        public String recargaMovil()
        {
            return val.valida() + rec.recarga();
        }

}
