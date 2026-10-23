INICI
a ← array de 5 enters
b ← array de 5 enters
resultat ← array de 5 enters

    escriure("Introdueix els 5 valors de l'array a:")
    per i ← 0 fins a 4 fer
        escriure("a[", i, "]:")
        llegir(a[i])
    fi

    escriure("Introdueix els 5 valors de l'array b:")
    per i ← 0 fins a 4 fer
        escriure("b[", i, "]:")
        llegir(b[i])
    fi

    per i ← 0 fins a 4 fer
        resultat[i] ← a[i] + b[i]
    fi

    escriure("Array a:")
    per i ← 0 fins a 4 fer
        escriure(a[i])
    fi

    escriure("Array b:")
    per i ← 0 fins a 4 fer
        escriure(b[i])
    fi

    escriure("Array resultat:")
    per i ← 0 fins a 4 fer
        escriure(resultat[i])
    fi
FINAL