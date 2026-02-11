enum ScoreTable {
  A(1),
  E(1),
  I(1),
  O(1),
  U(1),
  L(1),
  N(1),
  R(1),
  S(1),
  T(1),
  D(2),
  G(2),
  B(3),
  C(3),
  M(3),
  P(3),
  F(4),
  H(4),
  V(4),
  W(4),
  Y(4),
  K(5),
  J(8),
  X(8),
  Q(10),
  Z(10);

  final int value; // Declares the value stored in each enum instance
  const ScoreTable(this.value); // Constructor
}

int score(String characters) {
  int total = 0;
  List<String> letters = characters.toUpperCase().split("");

  for (var letter in letters) {
    var enumLetter = ScoreTable.values
      .firstWhere(
        (e) => e.name == letter
      );
    total += enumLetter.value;
  }

  return total;
}
