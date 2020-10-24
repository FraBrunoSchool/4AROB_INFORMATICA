#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#define LUNG 20
#define NMAXVOTI 10
#define NMAXMATERIE 15

typedef struct{
   int g;
   int m;
   int a;
}Data;

Data creaData(int g, int m, int a);    //inserisci controllo correttezza data
void stampaData(Data d);

typedef struct{
   Data giorno;
   float voto;
   float peso;
   char tipo;           // S o P o O oppure TipoVoto tipo;
}Voto;

Voto creaVoto(Data giorno, float voto, float peso, char tipo); //con controllo dati
void stampaVoto(Voto v);

typedef struct{
   char nome[LUNG];
   Voto voti[NMAXVOTI];
   int nVoti;
   float media;
}Materia;

Materia creaMateria(char nome[]);    //inizializza nVoti
void stampaMateria(Materia m);
void aggiungiVoto(Materia *m, Voto v);

typedef struct{
   int periodo;
   Materia votiMaterie[NMAXMATERIE];
   int nMaterie;
}Pagella;

Pagella creaPagella(int periodo);    //inizializza nMaterie
void stampaPagella(Pagella p);
void aggiungiMateria(Pagella *p, Materia m);
void aggiungiVotoMateria(Pagella *p, char nomeMateria[], Voto v);

//main
int main(int argc, char const *argv[]) {
  Materia m1,m2,m3;

  m1=creaMateria("info");
  m2=creaMateria("ita");
  m3=creaMateria("mate");

  Data d;
  d = creaData(1,2,2018);
  //stampaData(d);

  Voto v= creaVoto(d,5.5,2,'s');
  aggiungiVoto(&m1,v);
  aggiungiVoto(&m2,v);
  aggiungiVoto(&m3,v);

  //stampaVoto(v);


  //stampaVoto(v);

  /*stampaMateria(m1);
  printf("\n");
  stampaMateria(m2);
  */

  Pagella p= creaPagella(1);
  aggiungiMateria(&p,m1);
  aggiungiMateria(&p,m2);
  aggiungiMateria(&p,m3);
  stampaPagella(p);
  printf("\n");
  d = creaData(2,2,2020);
  v = creaVoto(d,7.5,2,'p');
  aggiungiVotoMateria(&p,"ita",v);
  aggiungiVotoMateria(&p,"mate",v);
  stampaPagella(p);

  return 0;
}

//inserisci controllo correttezza
Data creaData(int g, int m, int a){
   int v[]={31,28,31,30,31,30,31,31,30,31,30,31};
   Data d;
   if (m > 0 && m < 13){
     d.m=m;
   }
   else{
     d.m=1;
   }
   if (v[m-1] >= g && g > 0){
     d.g=g;
   }
   else{
     d.g=1;
   }
   if (a > 0){
     d.a=a;
   }
   else{
     d.a=2000;
   }
   return d;
}

void stampaData(Data d){
    printf("%d/%d/%d", d.g, d.m , d.a);
}

Voto creaVoto(Data giorno, float voto, float peso, char tipo){ //inserisci con controllo
    Voto v;
    v.giorno=giorno;
    if (voto>=1 && voto <=10)
        v.voto=voto;
    else
        v.voto=0;
    if (peso>=0)
        v.peso = peso;
    else
        v.peso = 1;
    if (tipo == 's' || tipo == 'o' || tipo == 'p'){
      v.tipo = tipo;}
    else
        {v.tipo = 'o';}
    return v;
}

void stampaVoto(Voto v){
    stampaData(v.giorno);
    printf(": %.2f (%.2f) %c", v.voto, v.peso, v.tipo);
};

Materia creaMateria(char nome[]){    //inizializza nVoti
    Materia m;
    //m.media=0;
    strcpy(m.nome, nome);
    m.nVoti=0;

    return m;
}

void stampaMateria(Materia m){
    int k;
    float media=0;
    float sommaP=0;     //somma pesi
    float sommaVP=0;    //somma voti pesati

    printf("%-5s : ",m.nome);
    for (k=0; k<m.nVoti; k++){
        stampaVoto(m.voti[k]);
        sommaP += m.voti[k].peso;
        sommaVP += m.voti[k].voto * m.voti[k].peso;
        printf("\n        ");
    }
    if (sommaP != 0)
        media = sommaVP /sommaP;
    else
        media = -1;
    printf("media: %.2f\n", media);
}

void aggiungiVoto(Materia *m, Voto v){
    if (m->nVoti < NMAXVOTI){
        m->voti[m->nVoti] = v;
        m->nVoti++;
    }
}

Pagella creaPagella(int periodo){    //inizializza nMaterie
    Pagella p;
    if (periodo>=1 && periodo<=3)
        p.periodo = periodo;
    else{
        p.periodo = 1;
      }
    p.nMaterie = 0;
    return p;
}

void stampaPagella(Pagella p){
  int k;

  printf("Periodo %d:\n", p.periodo);
  for (k=0; k<p.nMaterie; k++){
      stampaMateria(p.votiMaterie[k]);
      printf("\n");
  }
}

void aggiungiMateria(Pagella *p, Materia m){
  if (p->nMaterie < NMAXMATERIE){
      p->votiMaterie[p->nMaterie] = m;
      p->nMaterie++;
  }
}

void aggiungiVotoMateria(Pagella *p, char nomeMateria[], Voto v){
  int tro=-1;
  int k=0;

  while (k < p->nMaterie && tro == -1 ){
      if (strcmp(nomeMateria, p->votiMaterie[k].nome)==0){
          tro = k;
      }
      k++;
  }
  if (tro == -1)
      printf ("\n>>>Materia inesistente");
  else
      aggiungiVoto(&p->votiMaterie[tro], v);
}
