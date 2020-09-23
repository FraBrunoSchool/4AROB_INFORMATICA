import java.util.Date;
import java.util.Vector;

public class Contratto {
    private Cliente sottoscrittoDa;
    private String cellulare;
    private Date validoDa;
    private Date emessaFatturaIl;
    private final static int TEMPOSOLLECITO = 30;
    private TipoContratto tipo;
    private final static int COSTO_EVO=65;
    private final static int COSTO_PLUS=35;
    private final static int COSTO_START=18;
    private Vector<Numero> numeriGratis;
    private final static int MAX_NUMGRATIS=3;


    public Contratto(Cliente sottoscrittoDa, String cellulare, Date validoDa, TipoContratto tipo) {
        this.sottoscrittoDa = sottoscrittoDa;
        this.cellulare = cellulare;
        this.validoDa = validoDa;
        this.tipo = tipo;
        numeriGratis=new Vector<Numero>();
    }

    public void setSottoscrittoDa(Cliente sottoscrittoDa) {
        this.sottoscrittoDa = sottoscrittoDa;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public void setValidoDa(Date validoDa) {
        this.validoDa = validoDa;
    }

    public void setEmessaFatturaIl(Date emessaFatturaIl) {
        this.emessaFatturaIl = emessaFatturaIl;
    }

    public void setTipo(TipoContratto tipo) {
        this.tipo = tipo;
    }

    public Cliente getSottoscrittoDa() {
        return sottoscrittoDa;
    }

    public String getCellulare() {
        return cellulare;
    }

    public Date getValidoDa() {
        return validoDa;
    }

    public Date getEmessaFatturaIl() {
        return emessaFatturaIl;
    }

    public static int getTEMPOSOLLECITO() {
        return TEMPOSOLLECITO;
    }

    public TipoContratto getTipo() {
        return tipo;
    }

    public static int getCostoEvo() {
        return COSTO_EVO;
    }

    public static int getCostoPlus() {
        return COSTO_PLUS;
    }

    public static int getCostoStart() {
        return COSTO_START;
    }

    @Override
    public String toString() {
        return "Contratto{" +
                "sottoscrittoDa=" + sottoscrittoDa +
                ", cellulare='" + cellulare + '\'' +
                ", validoDa=" + validoDa +
                ", emessaFatturaIl=" + emessaFatturaIl +
                ", tipo=" + tipo +
                ", numeriGratis=" + numeriGratis +
                '}';
    }

    public class Numero{
        private String cellulare;

        public Numero(String cellulare) {
            this.cellulare = cellulare;
        }

        public String getCellulare() {
            return cellulare;
        }

        public void setCellulare(String cellulare) {
            this.cellulare = cellulare;
        }

        @Override
        public String toString() {
            return "Numero{" +
                    "cellulare='" + cellulare + '\'' +
                    '}';
        }
    }
}
