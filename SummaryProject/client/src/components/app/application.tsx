import React, { useEffect, useState } from "react";

interface Settlement {
  department: string;
  balance: Record<string, number>;
}

export function Application() {
  const [settlements, setSettlements] = useState<Settlement[]>([]);

  function loadSettlements() {
    setSettlements([
      { department: "furniture", balance: { "1000kr": 3, "200kr": 80 } },
      { department: "cafeteria", balance: { "100kr": 50, "200kr": 60 } },
    ]);
  }

  useEffect(() => {
    loadSettlements();
  }, []);

  return (
    <>
      <h1>Dugnadsoppgjør</h1>
      {settlements.map((s) => (
        <div>{s.department}</div>
      ))}
    </>
  );
}
