## 👋 Hi, I'm Zain

**AI Engineer at AiDX Solutions** — I build LLM systems that run in production, not just in demos.

Most AI projects work on a happy path and break with real users. My work is the second part: multi-agent systems that know when to escalate, RAG pipelines that retrieve the right thing, and the guardrails, evaluation and cost monitoring that keep them trustworthy once real traffic hits.

📍 Lahore, Pakistan · 💼 Open to AI Engineering roles & contracts · 📩 syedzaynraza@gmail.com

---

## 🛠️ Selected Work

> Most of this is client and production code, so the repos are private — happy to walk through architecture and decisions in a conversation.

**🏥 DocTalk — Multi-Agent Clinical Assistant** · *Team Lead*  
A LangGraph system that answers patient-specific clinical questions for care managers. Decomposes questions into sub-queries, routes each to a specialist agent, retrieves from ClickHouse and MSSQL in real time, and escalates to a human when confidence is low. **Cut query resolution time by 65%**, under HIPAA-aligned privacy controls.  
`LangGraph` `GPT-4` `Claude` `RAG` `ClickHouse` `MSSQL` `FastAPI`

**🔌 MCP Server — Enterprise Tool Layer**  
A Model Context Protocol server exposing **~68 LLM-invokable tools**, secured with OAuth2/Auth0 and schema-validated I/O, so agents can act on enterprise systems safely.  
`MCP` `OAuth2` `Auth0` `FastAPI` `Python`

**📞 PharmaVoice — AI Pharmacy Calling Agent**  
Handles real inbound and outbound phone calls for pharmacies — refill requests, order status, automated outreach — with no human on the line. Connects to pharmacy systems to act on live data.  
`AutoGen` `LiveKit` `ElevenLabs` `Whisper` `Real-time voice`

**🎙️ Voice-Enabled AI Assistant** · *Lead Developer*  
Real-time conversational pipeline at **sub-500ms response latency**, across **10,000+ production interactions** at 94% user satisfaction.  
`LiveKit` `Whisper` `ElevenLabs` `LangGraph` `WebRTC`

**📚 AssistX Suite — Enterprise RAG Platform** · [Live demo →](https://ai-suite.assistx.dev)  
Hybrid retrieval (dense vector + BM25 + reranking) across pgvector, FAISS and Elasticsearch, with 14 chunking strategies, a VLM parser for structured PDF extraction, and permission-aware ingestion from Google Drive, OneDrive, Dropbox, S3 and FTP.  
`RAG` `Elasticsearch` `pgvector` `FAISS` `Redis` `Langfuse`

**🧠 Nexonomy — AI Decision Intelligence**  
Enterprise platform making complex business decisions explainable, auditable and replayable, with a connected Decision Graph. Runs inside the customer's own AWS environment.  
`LLMs` `Decision workflows` `AWS`

**📊 Spark/Iceberg Pipelines** · *US client (Infillion/MediaMath)*  
Found and fixed a silent data-multiplication bug inflating row counts **up to 134×** across 6+ live BI dashboards that nobody had reported, plus a Spark type-coercion bug that had quietly disabled partition pruning.  
`PySpark` `Apache Iceberg` `Airflow` `Kubernetes` `BigQuery`

**⚖️ Legal AI Research Platform** · [Repo →](https://github.com/ZainRaza116/LegalAI)  
Legal research platform serving 5K+ users with document analysis, automated court-brief generation, and a fine-tuned LLM on legal documents.  
`Django` `LangChain` `Hugging Face` `Stripe`

---

## 💻 Tech Stack

**AI & LLMs**  
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![LangChain](https://img.shields.io/badge/LangChain-1C3C3C?style=for-the-badge&logo=langchain&logoColor=white)
![OpenAI](https://img.shields.io/badge/OpenAI-412991?style=for-the-badge&logo=openai&logoColor=white)
![HuggingFace](https://img.shields.io/badge/Hugging%20Face-FFD21E?style=for-the-badge&logo=huggingface&logoColor=black)
![PyTorch](https://img.shields.io/badge/PyTorch-EE4C2C?style=for-the-badge&logo=pytorch&logoColor=white)

*LangGraph · LlamaIndex · AutoGen · MCP · RAG · LoRA/QLoRA fine-tuning · LangSmith · Langfuse*

**Backend**  
![FastAPI](https://img.shields.io/badge/FastAPI-005571?style=for-the-badge&logo=fastapi)
![Django](https://img.shields.io/badge/django-%23092E20.svg?style=for-the-badge&logo=django&logoColor=white)
![Flask](https://img.shields.io/badge/flask-%23000.svg?style=for-the-badge&logo=flask&logoColor=white)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)

**Data & Search**  
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)
![Elasticsearch](https://img.shields.io/badge/Elasticsearch-005571?style=for-the-badge&logo=elasticsearch&logoColor=white)
![Spark](https://img.shields.io/badge/Apache%20Spark-E25A1C?style=for-the-badge&logo=apachespark&logoColor=white)
![Airflow](https://img.shields.io/badge/Airflow-017CEE?style=for-the-badge&logo=apacheairflow&logoColor=white)

**Cloud & DevOps**  
![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white)
![GCP](https://img.shields.io/badge/Google%20Cloud-4285F4?style=for-the-badge&logo=google-cloud&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Kubernetes](https://img.shields.io/badge/kubernetes-%23326ce5.svg?style=for-the-badge&logo=kubernetes&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232671E5.svg?style=for-the-badge&logo=githubactions&logoColor=white)

---

## ✍️ Writing

I write about AI engineering — recent topics include KV cache optimization in production LLM serving and what actually breaks when RAG systems meet real users. Published contributor to **The Friday Times**.

📝 [LinkedIn](https://linkedin.com/in/syed-zain-raza) · 🐦 [X / Twitter](https://x.com/MrZainRaza)

---

## 📊 GitHub Stats

![](https://github-readme-stats.vercel.app/api?username=ZainRaza116&theme=dark&hide_border=false&include_all_commits=true&count_private=true)
![](https://github-readme-stats.vercel.app/api/top-langs/?username=ZainRaza116&theme=dark&hide_border=false&layout=compact)

---

## 📫 Get in touch

[![LinkedIn](https://img.shields.io/badge/LinkedIn-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/syed-zain-raza)
[![X](https://img.shields.io/badge/X-black.svg?style=for-the-badge&logo=X&logoColor=white)](https://x.com/MrZainRaza)
[![Email](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:syedzaynraza@gmail.com)
