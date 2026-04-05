# 🖥️ PC Mania

> Sistema de gerenciamento de pedidos de computadores desenvolvido em Java com foco em Programação Orientada a Objetos

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)

## 📋 Sobre o Projeto

PC Mania é um sistema de vendas de computadores que permite aos clientes visualizar promoções, adicionar produtos ao carrinho e processar pedidos. O projeto foi desenvolvido aplicando os principais conceitos de Programação Orientada a Objetos, incluindo encapsulamento, composição e modularização.

### ✨ Funcionalidades

- 📝 Cadastro de cliente com nome e CPF
- 🛒 Sistema de carrinho de compras
- 💻 Catálogo de computadores com diferentes configurações
- 🔧 Especificações detalhadas de hardware
- 💾 Suporte a memórias USB adicionais (pen-drives e HDs externos)
- 💰 Cálculo automático do valor total da compra
- 📊 Exibição completa do pedido processado

## 🏗️ Arquitetura do Projeto

```
PCMania/
├── src/
│   ├── Main.java                    # Ponto de entrada da aplicação
│   ├── cliente/
│   │   └── Cliente.java             # Modelo de cliente
│   ├── computador/
│   │   ├── Computador.java          # Modelo de computador
│   │   ├── HardwareBasico.java      # Componentes de hardware
│   │   ├── MemoriaUSB.java          # Dispositivos USB
│   │   └── SistemaOperacional.java  # Sistema operacional
│   └── util/
│       └── ProcessarPedido.java     # Processamento de pedidos
└── README.md
```

## 🎯 Conceitos de POO Aplicados

- **Encapsulamento**: Atributos privados com métodos getters e setters
- **Composição**: Computador composto por HardwareBasico, SistemaOperacional e MemoriaUSB
- **Modularização**: Organização em pacotes (cliente, computador, util)
- **Coesão**: Cada classe possui responsabilidade única e bem definida
- **Imutabilidade**: Atributos finais em Cliente para garantir integridade dos dados

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, NetBeans) ou terminal

### Compilação e Execução

#### Via Terminal

```bash
# Navegar até o diretório do projeto
cd PCMania/src

# Compilar
javac Main.java

# Executar
java Main
```

#### Via IDE

1. Abra o projeto na sua IDE
2. Localize o arquivo `Main.java`
3. Execute o método `main`

## 💡 Exemplo de Uso

```
Olá! Qual é seu nome?: João Silva
Para maior segurança, insira seu CPF: 123.456.789-00
Escolha uma promoção (1, 2 ou 3) ou 0 para finalizar: 1
Promoção do computador Apple adicionada ao carrinho!

Escolha uma promoção (1, 2 ou 3) ou 0 para finalizar: 0

Cliente: João Silva
CPF: 123.456.789-00
Pedido enviado...

Informações do dispositivo:
Marca: Apple
Sistema Operacional: macOS Sequoia (64 bits)
Processador: Processador Core i3 (2200.0 Mhz)
Memória interna: Memória RAM de 8.0 GB
Armazenamento interno: HD de 500.0 GB
* Acompanha Pen-drive de 16 GB
    Preço: R$2172,00

Total: R$2172,00
A PC Mania agradece a sua confiança!
```

## 📦 Promoções Disponíveis

| Promoção | Marca | Processador | RAM | HD | Sistema | Brinde | Preço |
|----------|-------|-------------|-----|-------|---------|--------|-------|
| 1 | Apple | Core i3 2.2GHz | 8GB | 500GB | macOS Sequoia | Pen-drive 16GB | R$ 2.172,00 |
| 2 | Samsung | Core i5 3.37GHz | 16GB | 1TB | Windows 8 | Pen-drive 32GB | R$ 3.406,00 |
| 3 | Dell | Core i7 4.5GHz | 32GB | 2TB | Windows 10 | HD Externo 1TB | R$ 7.850,00 |

## 🔧 Estrutura de Classes

### Cliente
Representa o cliente da loja com seus dados pessoais e carrinho de compras.

**Atributos:**
- `nome`: Nome do cliente
- `cpf`: CPF do cliente
- `computadores[]`: Array de computadores no carrinho
- `qtd`: Quantidade de computadores

**Métodos:**
- `addComputador(Computador)`: Adiciona computador ao carrinho
- `calculaTotalCompra()`: Calcula valor total da compra

### Computador
Representa um computador com suas especificações completas.

**Atributos:**
- `marca`: Marca do computador
- `preco`: Preço do produto
- `sistemaOperacional`: Sistema operacional instalado
- `hardwares[]`: Array de componentes de hardware
- `musb`: Memória USB adicional (opcional)

**Métodos:**
- `mostraPCConfigs()`: Exibe configurações completas
- `addMemoriaUSB(MemoriaUSB)`: Adiciona brinde USB

### HardwareBasico
Representa componentes de hardware (processador, RAM, HD).

### MemoriaUSB
Representa dispositivos de armazenamento USB (pen-drives, HDs externos).

### SistemaOperacional
Representa o sistema operacional instalado no computador.

### ProcessarPedido
Classe utilitária para processar e exibir o pedido final.

## 🎓 Aprendizados

Este projeto demonstra:
- Organização de código em pacotes
- Relacionamento entre classes (composição)
- Uso de arrays para gerenciar coleções
- Formatação de saída com `String.format()`
- Entrada de dados com `Scanner`
- Boas práticas de nomenclatura e estruturação

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
- Reportar bugs
- Sugerir novas funcionalidades
- Melhorar a documentação
- Enviar pull requests

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais.

## 👨‍💻 Autor

Pedro de Souza Labastie - GEC 2172
Desenvolvido como projeto acadêmico de Programação Orientada a Objetos (C06)

---

## ⚠️ AI Disclaimer

Este README foi gerado com auxílio de IA (Amazon Q Developer) utilizando o seguinte prompt:

```
baseado no meu projeto, faça um readme bonito e que pareça um readme de um projeto de POO profissional.
```

O conteúdo foi criado a partir da análise automática do código-fonte do projeto, estrutura de diretórios e funcionalidades implementadas.

**Nota:** Durante o desenvolvimento do projeto, houve uma única consulta ao Perplexity AI, utilizando o modelo GPT-5.4 Thinking. A conversa completa está documentada no arquivo [PERPLEXITY_PROMPT.md](PERPLEXITY_PROMPT.md).

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
