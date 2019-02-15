%hechos
esposo(andres, flor).
esposo(jose, maria).
padre(andres, luis).
padre(andres, jose).
padre(andres, jorge).
padre(jose, telonio).

%reglas
abuelo(A,N):-padre(A,P), padre(P,N).
hermano(X,Y):-padre(P,X), padre(P,Y),X\=Y.
tio(T,S):-hermano(T,P), padre(P,S).
cuñado(C,D):-hermano(C,X), esposo(X,D).
suegro(S,Y):-padre(S,R),esposo(R,Y).
madre(M,X):-esposo(P,M),padre(P,X).
