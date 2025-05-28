package Enums;

// The TipoAcabamentoImovel enum represents different levels of property finishing.
// This is used to determine value adjustments during property evaluation.

public enum TipoAcabamentoImovel {
    PARA_RESTAURO,              // Needs renovation (lowest value)
    USADA,                      // Used property (some depreciation)
    NOVA,                       // New property (standard value)
    NOVA_COM_ALTO_ACABAMENTO    // New property with high-end finishing (premium value)
}
